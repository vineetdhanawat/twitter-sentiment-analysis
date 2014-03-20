import imaplib
import email
import re
mail = imaplib.IMAP4_SSL('imap.gmail.com')
mail.login('', '')  #user / password
mail.list()
mail.select("") # connect to folder with matching label
result, data = mail.search(None, "ALL")
ids = data[0] # data is a list.
id_list = ids.split() # ids is a space separated string
latest_email_id = id_list[-1] # get the latest
result, data = mail.fetch(latest_email_id, "(RFC822)") # fetch the email body (RFC822) for the given ID
raw_email = data[0][1] # here's the body, which is raw text of the whole email
raw_email_string = raw_email.decode('utf-8')
email_message = email.message_from_string(raw_email_string)
for part in email_message.walk():
		if part.get_content_type() == "text/plain":
			body = part.get_payload(decode=True)
			body_string = body.decode('utf-8')
			#match = re.search("(?P<url>https?://[^\s]+)", body_string)
			myString_list = [item for item in body_string.split(" ")]
			for item in myString_list:
				save_string = str("PATH" + ".eml") #set to save location
				myfile = open(save_string, 'a')
				myfile.write(item+" ")
				myfile.close()
				print(item+" itemmmm")
				try:
					match = re.search("(?P<url>https?://[^\s]+)", item).group("url")
					if match is not None:
						print(match+" urrrrrrlll")
						if match.find("/status/") != -1:
							print(match+ "<-------------------")
							#print(body)
							save_string = str("PATH" + ".eml") #set to save location
							myfile = open(save_string, 'a')
							myfile.write(match)
							myfile.close()
				except:
					pass			
			
		else:
			continue