# Twitter Sentiment Analysis - BITS Pilani

## Introduction
Used IFTTT to monitor twitter for the following keywords. #BITSPilani, #BITSGoa, #BITSHyd, #BITSDubai, #BITSAA, #BITS, #Pilani
Obviously this has lot of noise as well due to 'BITS' keyword.
Since IFTTT has stopped Twitter support for live searches, Use https://zapier.com/ and create your own dataset for analysis.

All the services will send you emails in one or the other formats, which is easy to parse. If you just have list of all tweets, Use twitter API to crawl the texts.
	
### IFTTT Email format

	ifttt

	via task 618721:
	http://ifttt.com/tasks/618721

	Agam, the band, with BITSian roots http://t.co/EvIumdmJ http://twitter.com/BITSAA/status/166177110573064192
	by http://twitter.com/BITSAA

## Usage
1. Twitter training dataset taken from http://thinknook.com/twitter-sentiment-analysis-training-corpus-dataset-2012-09-22/ .
2. Parsed and formatted training datasets for 1.5M and .1M tweets has been included.
3. BITS Pilani Dataset containing tweets for the duration January 20, 2012 to September 27, 2012
4. Rapidminer 5.3 with -Xms2048m -Xmx3072m took around 20 hours in SVM model for 0.1 Million rows dataset. Unless you have a better computing machine, training on 1.5M may take 3-4 weeks!

## Performance Vector
<table>
  <tr>
    <th></th><th>true 0</th><th>true 1</th><th>class precision</th>
  </tr>
  <tr>
    <td>pred. 0</td><td>24042</td><td>9922</td><td>70.79%</td>
  </tr>
  <tr>
    <td>pred. 1</td><td>19482</td><td>46537</td><td>70.49%</td>
  </tr>
  <tr>
    <td>class recall</td><td>55.24%</td><td>82.43%</td><td></td>
  </tr>
</table>

## License

MIT: http://vineetdhanawat.mit-license.org/
