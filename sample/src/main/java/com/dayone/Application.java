package com.dayone;

import com.dayone.model.Company;
import com.dayone.model.ScrapedResult;
import com.dayone.scraper.YahooFinanceScraper;
import org.apache.commons.collections4.Trie;
import org.apache.commons.collections4.trie.PatriciaTrie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
@EnableCaching
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);


//        System.out.println("Main -> " + Thread.currentThread().getName());

        /*Trie trie = new PatriciaTrie();
        AutoComplete autoComplete = new AutoComplete(trie);
        AutoComplete autoComplete1 = new AutoComplete(trie);
        autoComplete.add("hello");
        System.out.println(autoComplete.get("hello"));
        System.out.println(autoComplete1.get("hello"));*/


        /*YahooFinanceScraper scraper = new YahooFinanceScraper();*/

        /*var result = scraper.scrap(Company.builder().ticker("O").build());*/
        /*var result = scraper.scrapCompanyByTicker("MMM");
        System.out.println(result);*/
    }
}
