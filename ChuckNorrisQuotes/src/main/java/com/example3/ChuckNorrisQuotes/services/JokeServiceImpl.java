package com.example3.ChuckNorrisQuotes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {


    private ChuckNorrisQuotes chuckNorrisQuotes;

//    //OR
//    public JokeServiceImpl() {
//        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
//    }
    //OR with creating a bean in chuckConfiguration Class
    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes){
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String joke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
