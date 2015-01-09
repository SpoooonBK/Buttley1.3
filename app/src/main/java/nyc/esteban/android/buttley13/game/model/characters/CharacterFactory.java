package nyc.esteban.android.buttley13.game.model.characters;

import nyc.esteban.android.buttley13.game.model.characters.names.CharacterNamesEnum;

/**
 * Created by Tara on 1/8/2015.
 */
public class CharacterFactory {

    private static GameCharacter gameCharacter;

    public static GameCharacter buildCharacter(CharacterNamesEnum characterNamesEnum){
        return gameCharacter;
    }



}
