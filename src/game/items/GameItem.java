package game.items;

import game.core.GameEntity;
import game.map.Position;

/**
 * מחלקה שמייצגת פריט בסיסי במשחק – עצם שנמצא על המפה.
 * פריט עשוי להיות שיקוי, קיר, אוצר או כל ישות שאינה דמות.
 * מממש את הממשק {@link GameEntity} ומכיל מידע על מיקום, חסימת תנועה ותיאור טקסטואלי.
 * מחלקה זו מהווה בסיס לפריטים מתקדמים יותר.
 *

 */
public class GameItem implements GameEntity {

    /**
     * מיקום הפריט על הלוח.
     */
    private Position position;

    /**
     * האם הפריט חוסם תנועה (true = אי אפשר לעבור דרכו).
     */
    private boolean blocksMovement;

    /**
     * תיאור טקסטואלי של הפריט (גם משמש כסמל ויזואלי במפה).
     * לא ניתן לשינוי לאחר יצירת האובייקט.
     */
    private final String description;

    /**
     * בונה פריט חדש עם מיקום, תיאור, והגדרה האם הוא חוסם תנועה.
     *
     * @param position       מיקום התחלה של הפריט.
     * @param blocksMovement האם חוסם תנועה.
     * @param description    תיאור טקסטואלי של הפריט.
     */
    public GameItem(Position position, boolean blocksMovement, String description) {
        this.position = position;
        this.blocksMovement = blocksMovement;
        this.description = description;
    }

    /**
     * מחזיר את התיאור של הפריט – משמש גם להצגה וגם ללוגים.
     *
     * @return מחרוזת המתארת את הפריט.
     */
    @Override
    public String toString() {
        return description;
    }


    @Override
    public Position getPosition() {
        return position;
    }


    @Override
    public void setPosition(Position newPos) {
        position = newPos;
    }

    /**
     *
     * כאן, התיאור משמש גם כסמל לתצוגה (לדוגמה: "@" או "$").
     */
    @Override
    public String getDisplaySymbol() {
        return description;
    }

    /**
     *
     * במימוש הזה, השדה blocksMovement מתעדכן לפי הנראות (לצורך הדגמה בלבד).
     * מומלץ להפריד בין 'חוסם תנועה' ל-'גלוי' במימושים מתקדמים יותר.
     *
     * @param visible האם הפריט גלוי (true) או מוסתר (false).
     */
    @Override
    public void setVisible(boolean visible) {
        blocksMovement = visible; 
    }
}
