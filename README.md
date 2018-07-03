# Android Permission Recommendation

In this repository, we will introduce how to recommend permissions for an Android app using Mulan (http://mulan.sourceforge.net/download.html), which is a multi-label classificaiton tool. 

## Mulan
Mulan is an open-source Java library for learning from <b>multi-label</b> datasets. Multi-label datasets consist of training examples of a target function that has multiple binary target variables. This means that each item of a multi-label dataset can be a member of multiple categories or annotated by many labels (classes).

For Android permission recommendation, each app has several permissions, which are corresponding to multiple labels. 

We have downloaded the <b>Mulan.jar</b> Jar and <b>Weka.jar</b>, upon which Mulan is built. You can find these libraries in the folder [<b>libs</b>](https://github.com/baolingfeng/APRecForSummerSchool/tree/master/libs).
 
For more information about Mulan, please refer to its offical documentation: http://mulan.sourceforge.net/documentation.html 

## Dataset
We have constructed a dataset based on 936 Android apps, which is in folder [<b>data</b>](https://github.com/baolingfeng/APRecForSummerSchool/tree/master/data).

There are two files in folder [<b>data</b>](https://github.com/baolingfeng/APRecForSummerSchool/tree/master/data):
  * [app_permission_api.arff](https://github.com/baolingfeng/APRecForSummerSchool/blob/master/data/app_permission_api.arff)
  * [app_permission_api.xml](https://github.com/baolingfeng/APRecForSummerSchool/blob/master/data/app_permission_api.xml)

For more information of these apps, please refer to [our research paper](https://baolingfeng.github.io/papers/scis_paper.pdf)


