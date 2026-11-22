package desu.inugram.helpers.pillstack

import desu.inugram.helpers.menu.MenuOrderItem
import org.telegram.messenger.R

// entiny: the fixed pill types (id < RateInstances.FIRST_ID); rate pairs are dynamic, see RateInstances.
enum class PillType(
    val id: Int,
    override val key: String,
    override val labelRes: Int,
    override val iconRes: Int,
) : MenuOrderItem {
    CLOCK(1, "clock", R.string.InuPillStackClock, R.drawable.entiny_clock),
    CACHE(3, "cache", R.string.StorageUsage, R.drawable.msg_filled_storageusage),
    GHOST(5, "ghost", R.string.InuGhostMode, R.drawable.inu_ghost),
    RAM(6, "ram", R.string.InuPillStackRam, R.drawable.entiny_microchip),
    NET_SPEED(8, "net_speed", R.string.InuPillStackNetSpeed, R.drawable.entiny_activity),
    DC_PING(9, "dc_ping", R.string.InuPillStackDcPing, R.drawable.entiny_signal),
    BATTERY(10, "battery", R.string.InuPillStackBattery, R.drawable.entiny_battery_charging),
    STORAGE(11, "storage", R.string.InuPillStackStorage, R.drawable.entiny_server),
    LAST_SEEN(12, "last_seen", R.string.InuPillStackLastSeen, R.drawable.entiny_eye),
}
