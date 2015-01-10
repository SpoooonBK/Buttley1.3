package nyc.esteban.android.buttley13.game.model.characters;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import java.util.List;

import nyc.esteban.android.buttley13.game.model.characters.names.CharacterNamesEnum;
import nyc.esteban.android.buttley13.game.model.sounds.Sound;

/**
 * Created by Tara on 1/8/2015.
 */
public class CharacterFactory {

    private static GameCharacter gameCharacter;
    private static List<GameCharacter> gameCharacterList;



//    private int name;
//    private int type;
//    private int like;
//    private int dislike;





    public static List<GameCharacter> buildAllCharacters(){

        for(CharacterNamesEnum name: CharacterNamesEnum.values()){
            gameCharacterList.add(buildCharacter(name));
        }

    }

    public static GameCharacter buildCharacter(CharacterNamesEnum characterNamesEnum){

        CharacterProfile characterProfile = new CharacterProfile(characterNamesEnum);
        Bitmap snapshot = null;
        List<AnimationDrawable> animations = null;
        List<Sound> sounds = null;
        boolean unlocked = true;


        switch (characterNamesEnum){

            case AIR_BISCUIT:{


            }
        }

        gameCharacter = new Bean(snapshot, animations, sounds, characterProfile, unlocked);

        return gameCharacter;
    }

    private static Bean buildBean(){
        Bean bean = null;
        return bean;

    }

    private static Patient buildPatient(){
        Patient patient = null;
        return patient;
    }


}
