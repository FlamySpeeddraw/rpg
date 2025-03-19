package com.flamingamaranth.character;

public class Name {
    private String name;

    public Name(String name) throws Exception {
        if(!isValid(name)) {
            throw new Exception("Le nom doit faire entre 3 et 12 caractères.");
        }
        
        this.name = name;
    }

    private boolean isValid(String name) {
        return name.length() >= 3 && name.length() <= 12;
    }

    public String getName() {
        return this.name;
    }
}
