package lesson01;
import lesson01.Resume;

import java.util.Collection;

/**
 * Kornilov
 * 22.03.2016
 */
public class Resumeimpl implements Resume {
    public String fullName;
    public String Jobs [];
    public double  getEngineVolume () {
        System.out.println("5.7");
        return (double)5.7;
    }
    Collection<String> Edu;

    Resumeimpl(String fN) {
        fullName=fN;
    }
    public String getResume () {
        return "Jaree leto";
    }
    public void setResume (String fullName) {
    this.fullName=fullName;
    }


}
