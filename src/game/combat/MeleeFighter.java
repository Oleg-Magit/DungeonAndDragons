package game.combat;

import game.map.Position;

/**
 * ממשק שמייצג לוחם לטווח קצר (קרב מגע).
 * ישויות שמממשות את הממשק הזה יודעות לבצע לחימה קרובה (melee) ולבדוק טווח קרב מגע.
 * מתאים לדמויות כמו Warrior, Goblin, Orc ועוד.
 *
 */
public interface MeleeFighter {

    /**
     * מבצעת התקפת קרב מגע על יריב קרוב.
     * ההתקפה מתבצעת רק אם היריב נמצא בטווח קרב מגע (לרוב מרחק == 1).
     *
     * @param target הישות שמותקפת.
     */
    void fightClose(Combatant target);

    /**
     * בודקת האם היריב נמצא בטווח קרב מגע ביחס למיקום העצמי.
     * לרוב משמש לחישוב אם מותר לבצע התקפה קרובה.
     *
     * @param self   מיקום של התוקף.
     * @param target מיקום של היעד (הקורבן).
     * @return true אם היריב נמצא בטווח קרב מגע, אחרת false.
     */
    boolean isInMeleeRange(Position self, Position target);
}
