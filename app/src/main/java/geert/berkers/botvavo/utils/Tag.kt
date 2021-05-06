package geert.berkers.botvavo

/**
 * Created by Zorgkluis (Geert Berkers)
 */
val Any.TAG: String
    get() {
        val tag = javaClass.simpleName
        return if (tag.length <= 23) tag else tag.substring(0, 23)
    }