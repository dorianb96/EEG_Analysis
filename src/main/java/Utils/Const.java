package Utils;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;

import java.awt.Font;

public class Const {

    public static final String VHDR_EXTENSION = ".vhdr";
    public static final String VMRK_EXTENSION = ".vmrk";
    public static final String EEG_EXTENSION = ".eeg";


    //-------------------------Hadoop HDFS Configuration---------------

    public static final String HDFS_URI = "hdfs://localhost:8020";
    public static final Configuration HDFS_CONF = new Configuration();

    ///--- this might be a good idea to explore
    public static final String HadoopUserPrefixFolder = "/user/digitalAssistanceSystem/";
    public static final String Data_folder = "/data/numbers/";

    //-------------------------MLP classifier------------------------
    public static final int DEFAULT_OUTPUT_NEURONS = 1; /* number of output neurons */

    public static final double LEARNING_RATE = 0.1;     /* learning step */

    public static final int NUMBER_OF_ITERATIONS = 2000;

    //------------------------Classifier training-----------------------
    //public static final String TRAINING_RAW_DATA_FILE_NAME = "data/train/no_artifacts2.dat";
    public static final String TRAINING_RAW_DATA_FILE_NAME = "data/train/no_artifacts2.dat";
    public static final String TRAINING_FILE_NAME = "data/new_models/winnermlpdwt.classifier";
    public static final String INFO_DIR = "data/numbers";

    //----------------------Epoch------------------------
    public static final int PREESTIMULUS_VALUES = 100;
    public static final int POSTSTIMULUS_VALUES = 750;
    public static final int SAMPLING_FQ = 1000;

    //----------------------Buffer-----------------------
    public static final int BUFFER_SIZE = 10000;
    public static final int NUMBER_OF_STIMULUS = 400;


    //----------------------Experiment---------------------
    public static final int USED_CHANNELS = 3;
    public static final int GUESSED_NUMBERS = 9;
    
    //---------------------Buffer-------------------
    public static final int RESERVE = 20;

    public static final int ELECTROD_VALS = 20;
    
    //---------------------TEST---------------------
   /* public static final String[] DIRECTORIES = {"data/numbers/Horazdovice", 
        "data/numbers/Blatnice","data/numbers/Strasice","data/numbers/Masarykovo", "data/numbers/Stankov", 
        "data/numbers/17ZS", "data/numbers/DolniBela", "data/numbers/KVary", "data/numbers/SPSD", "data/numbers/Strasice2",
        "data/numbers/Tachov", "data/numbers/Tachov2", "data/numbers/ZSBolevecka"};*/
//    public static final String[] DIRECTORIES = {"data/numbers/Horazdovice",
//        "data/numbers/Blatnice","data/numbers/Strasice","data/numbers/Masarykovo", "data/numbers/Stankov",
//         "data/numbers/DolniBela", "data/numbers/KVary", "data/numbers/SPSD", "data/numbers/Strasice2",
//        "data/numbers/Tachov", "data/numbers/Tachov2", "data/numbers/ZSBolevecka"};
    public static final String[] DIRECTORIES = {"data/numbers"};

}
