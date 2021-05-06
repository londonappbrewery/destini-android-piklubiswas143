package com.londonappbrewery.destini;

public class Model {
    int story,ansone,anstwo;
    public Model(int story, int ansone, int anstwo) {
        this.story=story;
        this.ansone=ansone;
        this.anstwo=anstwo;
    }
    public Model(int story) {
        this.story=story;

    }


    public int getStory() {
        return story;
    }

    public void setStory(int story) {
        this.story = story;
    }

    public int getAnsone() {
        return ansone;
    }

    public void setAnsone(int ansone) {
        this.ansone = ansone;
    }

    public int getAnstwo() {
        return anstwo;
    }

    public void setAnstwo(int anstwo) {
        this.anstwo = anstwo;
    }



}
