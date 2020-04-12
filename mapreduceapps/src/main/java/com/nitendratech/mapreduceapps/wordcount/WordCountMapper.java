package com.nitendratech.mapreduceapps.wordcount;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/*
 * Mapper class which consists of Map Function in which 
 *  Input :Object is the Key{line of the input file} and Text is content in that Line
 *  Output :Text is the Key{Word} and IntWritable is the Hadoop Data type which holds the count 
 *          for no of words that occured in that line
 * 
 */
public class WordCountMapper extends Mapper<Object ,Text ,Text ,IntWritable>{

	private final static IntWritable one = new IntWritable(1); //Hadoop supported Numeric Data Type
	
	private  Text wordInstance = new Text(); //Hadoop Data Type for Text
	
	//Tokenizes the line and frame initial Key/Value Pair
	public void map(Object key ,Text value ,Context context) throws IOException ,InterruptedException{
		
		String line = value.toString();  //Taking one line at a time
		StringTokenizer tokenizerForEachLine = new StringTokenizer(line);  //Seperates the word by using Default delimeter
		
		//Iterating through all the words available in the line and forming the  
		while(tokenizerForEachLine.hasMoreTokens()){
			wordInstance.set(tokenizerForEachLine.nextToken());
			
			//Sending result  to Reducer
			context.write(wordInstance, one);
		}
	}
	
	
	
	
	
	
	
	
}
