package nyc.esteban.android.buttley13.game.model.characters.names;

/**
 * Created by Tara on 1/8/2015.
 */
public enum CharacterNamesEnum {



    AIR_BISCUIT("air_biscuit"), /* Pilot */
    BABY("baby"), /* Baby */
    EDAMAMA("edamama"), /* FANCY LADY */
    BUBBA("bubba"), /* BIG FAT BEAN */
    DUSTY("dusty"), /* OLD FART COWBOY */
    HOLY_FRIJOLE("holy_frijole"), /* PADRE */
    TWERK("twerk"), /* DANCER */
    BAKED_JAKE("baked_jake"), /* SURFER */
    YOGI("yogi"), /*YOGA MASTER*/
    JOE("joe"), /* COFFEE BEAN (EXCITED) */
    SHARTY("sharty"), /*WET FART  -SHOWERCAP */
    SILENT_BUT_DEADLY("silent_but_deadly"), /* NINJA */
    DUTCH_OVEN("dutch_oven"), /* CHEF */;

    private String xmlName;

    private CharacterNamesEnum(String xmlName){
        this.xmlName = xmlName;
    }

}
