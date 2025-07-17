package designpattern.structure.facade;

import designpattern.structure.facade.facade.HomeTheaterFacade;
import designpattern.structure.facade.subsystem.Amplifier;
import designpattern.structure.facade.subsystem.CdPlayer;
import designpattern.structure.facade.subsystem.DvdPlayer;
import designpattern.structure.facade.subsystem.Projector;
import designpattern.structure.facade.subsystem.Tuner;

public class MainApp {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector);

        homeTheater.watchMovie("Matrix");
        homeTheater.endMovie();
    }
}

