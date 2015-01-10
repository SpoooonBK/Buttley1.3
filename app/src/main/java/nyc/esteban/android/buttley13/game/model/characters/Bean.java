package nyc.esteban.android.buttley13.game.model.characters;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;

import java.util.List;

import nyc.esteban.android.buttley13.game.model.sounds.Sound;

/**
 * Created by Tara on 1/8/2015.
 */
public class Bean extends GameCharacter{

    public Bean(Bitmap snapshot, List<AnimationDrawable> animations, List<Sound> sounds, CharacterProfile characterProfile, boolean unlocked) {
        super(snapshot, animations, sounds, characterProfile, unlocked);
    }
}
