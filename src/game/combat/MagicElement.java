package game.combat;

public enum MagicElement {
    FIRE("🔥"),
    ICE("❄️"),
    LIGHTNING("⚡"),
    ACID("🧪");
    private final String symbol;
    MagicElement(String symbol) {
        this.symbol = symbol;
    }
}

