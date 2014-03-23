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

## Performance Vector (SVM model)
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

## Stats
Top 10 Positive and Negative words
<table>
	<tr>
		<th>word</th><th>weight</th>
	</tr>
	<tr>
		<td>thank</td><td>0.06800427050495744</td>
	</tr>
	<tr>
		<td>love</td><td>0.04238921785592977</td>
	</tr>
	<tr>
		<td>good</td><td>0.03864780316342833</td>
	</tr>
	<tr>
		<td>great</td><td>0.03332699835307452</td>
	</tr>
	<tr>
		<td>quot</td><td>0.028049576202737663</td>
	</tr>
	<tr>
		<td>welcom</td><td>0.028045093611976712</td>
	</tr>
	<tr>
		<td>awesom</td><td>0.027883840586310205</td>
	</tr>
	<tr>
		<td>haha</td><td>0.027711586964757735</td>
	</tr>
	<tr>
		<td>nice</td><td>0.026502431781819224</td>
	</tr>
	<tr>
		<td>happi</td><td>0.024842171425360552</td>
	</tr>
</table>

<table>
	<tr>
		<th>word</th><th>weight</th>
	</tr>
	<tr>
		<td>sad</td><td>0.06904954519705979</td>
	</tr>
	<tr>
		<td>miss</td><td>0.06799716497097386</td>
	</tr>
	<tr>
		<td>sorri</td><td>0.06447410364223946</td>
	</tr>
	<tr>
		<td>wish</td><td>0.04964308132602499</td>
	</tr>
	<tr>
		<td>suck</td><td>0.04549754050714666</td>
	</tr>
	<tr>
		<td>bad</td><td>0.03882145370669514</td>
	</tr>
	<tr>
		<td>hate</td><td>0.038814744730334146</td>
	</tr>
	<tr>
		<td>work</td><td>0.038456277249749565</td>
	</tr>
	<tr>
		<td>poor</td><td>0.03537374379337165</td>
	</tr>
	<tr>
		<td>want</td><td>0.03312521661076012</td>
	</tr>
</table>

Total Tweets Ratio
<table>
	<tr>
		<td>Positive Tweets</td><td>4759</td>
	</tr>
	<tr>
		<td>Negative Tweets</td><td>1552</td>
	</tr>
</table>

## License

MIT: http://vineetdhanawat.mit-license.org/
