
package game.core;

import game.map.Position;

/**
 * ממשק המייצג כל ישות שמופיעה על המפה במשחק.
 * ישות יכולה להיות דמות, אויב, פריט, קיר וכו'.
 * כל ישות חייבת לדעת את מיקומה, האם היא נראית, ואיך לייצג את עצמה ויזואלית.
 *
 */
public interface GameEntity {

    /**
     * מחזיר את המיקום הנוכחי של הישות על המפה.
     *
     * @return האובייקט Position שמייצג את מיקום הישות.
     */
    Position getPosition();

    /**
     * מעדכן את מיקום הישות על המפה.
     *
     * @param newPos מיקום חדש (Position) אליו תועבר הישות.
     */
    void setPosition(Position newPos);

    /**
     * מחזיר תו טקסטואלי שמייצג את הישות במפה.
     * לדוגמה: '@' לשחקן, '#' לקיר, '$' לאוצר.
     *
     * @return מחרוזת אחת או יותר המשמשת לסמל הישות.
     */
    String getDisplaySymbol();

    /**
     * מגדיר האם הישות נראית לשחקן (לפי טווח ראייה).
     *
     * @param visible true אם הישות נראית, false אם מוסתרת.
     */
    void setVisible(boolean visible);
}