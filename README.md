# Android Permission Recommendation

In this repository, we will introduce how to recommend permissions for an Android app using Mulan (http://mulan.sourceforge.net/download.html), which is a multi-label classificaiton tool. 

## Mulan
Mulan is an open-source Java library for learning from <b>multi-label</b> datasets. Multi-label datasets consist of training examples of a target function that has multiple binary target variables. This means that each item of a multi-label dataset can be a member of multiple categories or annotated by many labels (classes).

For Android permission recommendation, each app has several permissions, which are corresponding to multiple labels. 

We have downloaded the <b>Mulan.jar</b> Jar and <b>Weka.jar</b>, upon which Mulan is built. You can find these libraries in the folder [<b>libs</b>](https://github.com/baolingfeng/APRecForSummerSchool/tree/master/libs).
 
For more information about Mulan, please refer to its offical documentation: http://mulan.sourceforge.net/documentation.html 

## Dataset
We have constructed a dataset based on 936 Android apps, which is in the folder [<b>data</b>](https://github.com/baolingfeng/APRecForSummerSchool/tree/master/data).

As Mulan requires two text files for the specification of a multi-label dataset: 
  * an ARFF file specifying the actual data. 
  * an XML file specifying the names of the labels and optionally any hierarchical relationships among them

We prepared the dataset according to the requirements of Mulan, which can be found in the folder [<b>data</b>](https://github.com/baolingfeng/APRecForSummerSchool/tree/master/data):
  * [app_permission_api.arff](https://github.com/baolingfeng/APRecForSummerSchool/blob/master/data/app_permission_api.arff)
  * [app_permission_api.xml](https://github.com/baolingfeng/APRecForSummerSchool/blob/master/data/app_permission_api.xml)

In our dataset, there are 2,729 APIs, and 45 permissions in total.   

Each app is represented as a feature vector, which is built on the APIs it uses. The length of the feature vector is equal to the number of the total APIs, i.e., 2,729. And each app has 45 labels, i.e., permissions. 

For more information, please refer to [our research paper](https://baolingfeng.github.io/papers/scis_paper.pdf)


