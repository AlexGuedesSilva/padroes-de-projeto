package designpattern.structure.facade.facade;

import designpattern.structure.facade.subsystem.Amplifier;
import designpattern.structure.facade.subsystem.CdPlayer;
import designpattern.structure.facade.subsystem.DvdPlayer;
import designpattern.structure.facade.subsystem.Projector;
import designpattern.structure.facade.subsystem.Tuner;

public class HomeTheaterFacade {
    private Amplifier amp;
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cd;
    private Projector projector;

    public HomeTheaterFacade
    (
    		Amplifier amp, Tuner tuner, DvdPlayer dvd, 
    		CdPlayer cd, Projector projector
    	) 
    {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        System.out.println("Prepare o sistema de Home Theater...");
        projector.on();
        amplifierOn(movie);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Desligando o sistema de Home Theater...");
        dvd.stop();
        dvd.off();
        projector.off();
        amp.off();
    }

    private void amplifierOn(String source) {
        amp.on();
        amp.setInput(source);
        amp.setVolume(5);
    }
}
