package sg.edu.smu.ap;

import mulan.classifier.lazy.MLkNN;
import mulan.classifier.meta.RAkEL;
import mulan.classifier.transformation.LabelPowerset;
import mulan.data.MultiLabelInstances;
import mulan.evaluation.Evaluator;
import mulan.evaluation.MultipleEvaluation;
import weka.classifiers.trees.J48;

public class APRec {
	public static void main(String[] args) throws Exception{
		
		String arffFilename = "data/app_permission_api.arff";
		String xmlFilename = "data/app_permission_api.xml";
		
		MultiLabelInstances dataset = new MultiLabelInstances(arffFilename, xmlFilename);

		RAkEL learner1 = new RAkEL(new LabelPowerset(new J48()));
		MLkNN learner2 = new MLkNN(); 
		
		Evaluator eval = new Evaluator();
		MultipleEvaluation results;
		
		int numFolds = 10;
		results = eval.crossValidate(learner1, dataset, numFolds);
		System.out.println(results);
		
		results = eval.crossValidate(learner2, dataset, numFolds);
		System.out.println(results);
	}
}
