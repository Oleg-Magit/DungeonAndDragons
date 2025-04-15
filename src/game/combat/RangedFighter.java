package game.combat;

import game.map.Position;

/**
 * ממשק שמייצג לוחם תוקף מרחוק (Range Fighter).
 * ישויות כאלה תוקפות מטרות בטווח מסוים, שלא צמודות אליהן (בניגוד ל-Melee).
 * מתאים לדמויות כמו Archer, Mage, Dragon וכו'.
 * כולל פעולת תקיפה מרחוק, בדיקת טווח מקסימלי, ובדיקה האם מטרה בטווח.
 *
 * @author (שמך)
 */
public interface RangedFighter {

    /**
     * מבצעת התקפה מרחוק על היריב הנתון.
     * עשויה להיות מבוססת על חצים, קסמים, ירי וכו'.
     *
     * @param target הישות שמותקפת.
     */
    void fightRange(Combatant target);

    /**
     * מחזירה את הטווח המקסימלי של ההתקפה מרחוק של הלוחם.
     * לדוגמה: קשת יכול לתקוף מטווח של 2 תאים.
     *
     * @return ערך של טווח התקיפה (ביחידות של תאי מפה).
     */
    int getRange();

    /**
     * בודקת האם היריב נמצא בטווח התקיפה של הלוחם.
     *
     * @param self   מיקום התוקף.
     * @param target מיקום היעד.
     * @return true אם היריב בטווח, אחרת false.
     */
    boolean isInRange(Position self, Position target);
}
