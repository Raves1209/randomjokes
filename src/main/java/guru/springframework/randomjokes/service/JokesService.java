package guru.springframework.randomjokes.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getJokes() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
