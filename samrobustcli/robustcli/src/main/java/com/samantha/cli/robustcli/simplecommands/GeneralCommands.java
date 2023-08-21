package com.samantha.cli.robustcli.simplecommands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class GeneralCommands {

    @ShellMethod
    public void greetings(@ShellOption(defaultValue = "There", help = "How would you like to be addressed?") String name){
        System.out.println("Hey " + name + " ! Fancy seeing you here! 👋");
    }
}
