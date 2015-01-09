package nyc.esteban.android.buttley13.game.model.characters;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;

import java.util.List;

import nyc.esteban.android.buttley13.game.model.sounds.Sound;

/**
 * Created by Tara on 1/8/2015.
 */
public abstract class GameCharacter {

    private Bitmap snapshot;
    private List<AnimationDrawable> animations;
    private List<Sound> sounds;
    private CharacterProfile characterProfile;
    private boolean unlocked;

    public Bitmap getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(Bitmap snapshot) {
        this.snapshot = snapshot;
    }

    public List<AnimationDrawable> getAnimations() {
        return animations;
    }

    public void setAnimations(List<AnimationDrawable> animations) {
        this.animations = animations;
    }

    public List<Sound> getSounds() {
        return sounds;
    }

    public void setSounds(List<Sound> sounds) {
        this.sounds = sounds;
    }

    public CharacterProfile getCharacterProfile() {
        return characterProfile;
    }



    public boolean isUnlocked() {
        return unlocked;
    }

    public void setUnlocked(boolean unlocked) {
        this.unlocked = unlocked;
    }




}
