package org.example.firstlink;

    import java.util.ArrayList;
import java.util.List;


    public class WebsiteClass {
        private List<String> urlList;

        public WebsiteClass() {
            urlList = new ArrayList<>();

        }

        public void printURLs() {
            urlList.add("https://pluralsight.com/search?q=java");
            urlList.add("https://medium.com/search?q=java");
            urlList.add("https://stackoverflow.com/questions/tagged/java");
            urlList.add("https://stackoverflow.com/search?q=java+list");
            urlList.add("https://reddit.com/r/java");
            urlList.add("https://reddit.com/r/javahelp");
            urlList.sort(null);
            List<String>firstTwo = urlList.subList(0, 2);
            int remaining = urlList.size() - 2;
            System.out.println(firstTwo);
            System.out.println("And " + remaining + " more.");
            List<String>remainingUrls = urlList.subList(2, urlList.size());
            System.out.println(remainingUrls);

        }
    }


