package lesson_6_1;

import java.util.concurrent.CountDownLatch; //initieras med ett nummer som är atal ggr den ska räkna ner
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-13
 */
public class Downloader {
    public static void main(String[] args)
    {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable<String> callable;
        callable = new Callable<String>()
        {
            @Override
            public String call() throws Exception {
                return null;
            }
        };

        String urlStr = "http://www.example.com/yourpath/foler/test.png";

        String fileName = urlStr.substring(urlStr.lastIndexOf('/')+1, urlStr.length());
        String fileNameWithoutExtension = fileName.substring(0, fileName.lastIndexOf('.'));
        String fileExtension = urlStr.substring(urlStr.lastIndexOf("."));

//        Log.i("File Name", fileName);
//        Log.i("File Name Without Extension", fileNameWithoutExtension);
//        Log.i("File Extension", fileExtension);

    }
}
