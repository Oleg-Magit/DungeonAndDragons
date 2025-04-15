package game.combat;

/**
 * ממשק שמייצג ישות שיכולה לבצע התקפות קסומות (Magic Attacks).
 * ישויות שמממשות את הממשק הזה יכולות לחשב נזק קסם, להחזיק יסוד קסם (MagicElement)
 * ולהשוות חוזק בין יסודות שונים.
 *
 * ממומש לדוגמה על ידי Mage, Dragon וכו'.
 *
 */
public interface MagicAttacker {

    /**
     * מבצעת חישוב של נזק קסם כלפי יריב מסוים.
     * החישוב עשוי להיות מושפע מהיסוד (element), כוח קסם, ועוד.
     *
     * @param target הישות שמותקפת בקסם.
     */
    void calculateMagicDamage(Combatant target);

    /**
     * בודקת האם היסוד הקסום של הישות הנוכחית חזק יותר מהיסוד של ישות אחרת.
     * נועד להשוות בין יסודות קסם שונים לפי לוגיקת חוזק (למשל אש חזק מקרח).
     *
     * @param other תוקף קסם אחר שיש להשוות מולו.
     * @return true אם היסוד של העצם הנוכחי חזק יותר, אחרת false.
     */
    boolean isElementStrongetThat(MagicAttacker other);

    /**
     * מחזיר את יסוד הקסם של הישות (למשל אש, קרח, חומצה וכו').
     *
     * @return ערך מה-enum MagicElement המייצג את סוג הקסם של הישות.
     */
    MagicElement getElement();
}
