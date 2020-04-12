package com.nitendratech.mapreduceapps.wordcount;



import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import com.nitendratech.mapreduceapps.DateUtility;

/*
	 * Driver Implmenetation
	 * Contains the Job Configuration for Mapper ,Reducer ,Input Path and OutPut Path
	 */

public class WordCount {
	
	
	public static void main(String [] args) throws Exception{
		Path inputPath = new Path(args[0]);
		Path outputPath = new Path(args[1]+DateUtility.geTodayDate());
		Configuration conf = new Configuration();
		Job mapreduceJob = Job.getInstance(conf ,"Word Count");
		mapreduceJob.setJarByClass(com.nitendratech.mapreduceapps.wordcount.WordCount.class);
		mapreduceJob.setMapperClass(com.nitendratech.mapreduceapps.wordcount.WordCountMapper.class);
		mapreduceJob.setCombinerClass(com.nitendratech.mapreduceapps.wordcount.WordCountReducer.class);
		mapreduceJob.setReducerClass(com.nitendratech.mapreduceapps.wordcount.WordCountReducer.class);
		mapreduceJob.setOutputKeyClass(Text.class);  //OutputKey type
		mapreduceJob.setOutputValueClass(IntWritable.class); //Output Value Type
		FileInputFormat.addInputPath(mapreduceJob, inputPath);  //add the Input Path 
		FileOutputFormat.setOutputPath(mapreduceJob, outputPath); //Output P
		 System.exit(mapreduceJob.waitForCompletion(true) ? 0 : 1);
	}
	
	}

