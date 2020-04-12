#### Steps to run the application

(a)Go to root folder of the project 
and type ```mvn clean install``` without the quotes
It will produce the jar file named "mapreduceapps-1.jar" in the target directory.

Copy this jar file to Hadoop cluster depending upon whether it is a windows or unix based installation

(b)Make sure Hadoop daemons is running in the background .
   To run Hadoop Daemons use the following commands from the Hadoop Path.
   ```bash
   $HADOOP_HOME/sbin/start-dfs.sh
   $HADOOP_HOME/sbin/start-yarn.sh
```


(c)Copy the files to input HDFS directory 

`````/user/hduser/input ````


output HDFS directory will be automatically created if not exists

(d)use that jar file to run Hadoop Jobto run WordCount job use the following command.

```bash
$hadoop jar /home/hduser/mapreduceapps-1.jar com.nitendratech.mapreduceapps.wordcount.WordCount /user/hduser/input /user/hduser/output/
```
Make sure that input file is copied to input HDFS directory and output directory does not exists

