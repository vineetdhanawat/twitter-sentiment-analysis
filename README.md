# Twitter Sentiment Analysis - BITS Pilani

## Introduction
Used IFTTT to monitor twitter for the following keywords. #BITSPilani, #BITSGoa, #BITSHyd, #BITSDubai, #BITSAA, #BITS, #Pilani
Obviously this has lot of noise as well due to 'BITS' keyword.

Emails in the particular format, easy to parse. If you just have list of all tweets, Use twitter API to crawl the texts.
	$ 
	
	ifttt

	via task 618721:
	http://ifttt.com/tasks/618721

	Agam, the band, with BITSian roots http://t.co/EvIumdmJ http://twitter.com/BITSAA/status/166177110573064192 by http://twitter.com/BITSAA

Use https://zapier.com/ and create your own dataset for analysis.

## Usage
1. Used the twitter training dataset from http://thinknook.com/twitter-sentiment-analysis-training-corpus-dataset-2012-09-22/ .
2. Two training datasets 1.5M and 5000 tweets has been included.
3. BITS Pilani Dataset for final analysis.
4. Rapidminer 5.3 with -Xms2048m -Xmx3072m took around 36 hours in SVM model.

## License

MIT: http://vineetdhanawat.mit-license.org/
