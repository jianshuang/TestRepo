import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-4
 * Time: 下午8:24
 * To change this template use File | Settings | File Templates.
 */
public class MommifyTest {
    Mommify app;

    @Before
    public void beforetask(){
        app = new Mommify();
    }

    //less than 30% (a: no vowels)
    @Test
    public void shouldreturnhmmwhenhmm(){
        String res = app.convertMethod("hmm");
        assertEquals("should return hmm when input hmm", res, "hmm");
    }
    //less than 30% (b: 25% vowels)
    @Test
    public void shouldreturnshipwhenship(){
        String res = app.convertMethod("ship");
        assertEquals("should return ship when input ship", res, "ship");
    }

    //more than 30% (a: one vowel)
    @Test
    public void shouldreturnhmommyswhenhis(){
        String res = app.convertMethod("his");
        assertEquals("should return hmommys when input his", res, "hmommys");
    }
    @Test
    public void shouldreturnshmommywhenshe(){
        String res = app.convertMethod("she");
        assertEquals("should return shmommy when input she", res, "shmommy");
    }

    //more than 30% (b: multiple vowels)
    @Test
    public void shouldreturnshmommypmommywhenshape(){
        String res = app.convertMethod("shape");
        assertEquals("should return shmommypmommy when input shape", res, "shmommypmommy");
    }
    @Test
    public void shouldreturnbmommynmommynmommywhenbanana(){
        String res = app.convertMethod("banana");
        assertEquals("should return bmommynmommynmommy when input banana", res, "bmommynmommynmommy");
    }

    //more than 30% (c: continuous vowels)
    @Test
    public void shouldreturndmommypwhendeep(){
        String res = app.convertMethod("deep");
        assertEquals("should return dmommyp when input deep", res, "dmommyp");
    }
    @Test
    public void shouldreturnshmommyrwhenshear(){
        String res = app.convertMethod("shear");
        assertEquals("should return shmommyr when input shear", res, "shmommyr");
    }

    //more than 30% (d: mixup for single and continuous vowels)
    @Test
    public void shouldreturnshmommympmommywhenshampoo(){
        String res = app.convertMethod("shampoo");
        assertEquals("should return shmommympmommy when input shampoo", res, "shmommympmommy");
    }
    @Test
    public void shouldreturntmommylkmommytwhentoolkit(){
        String res = app.convertMethod("toolkit");
        assertEquals("should return tmommylkmommyt when input toolkit", res, "tmommylkmommyt");
    }

}
