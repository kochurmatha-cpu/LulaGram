# removed features

what entinygram used to have and no longer ships, and why. one row per feature, rows are not rewritten.

## removed

| feature | what it did | why it is gone |
| --- | --- | --- |
| dc status page | showed the state and ping of every telegram datacenter | rarely used and hard to find. the code is deleted: `DatacenterStatusActivity`, `DatacenterPing`, `TelegramDc`, `Obfuscated2` |
| old config migrations | imported legacy keys for ghost mode, self-destruct, regex filter, translation language and feed | old keys are no longer read. `ConfigSanitizer` resets a broken value to its default on load. only recent migrations stay: archive scope, dialogs fab, center title |
| own icon packs | entinygram's own phosphor and vkui icon sets | upstream `.icons` packs from inugram are used instead |
| download queue | large files downloaded one at a time in request order, with a downloads list in the chats menu and cancel | the author does not use it and some of its parts caused download problems. the file reference and download patches it touched were rolled back to the upstream versions |
| keep downloads in background | downloads kept running when you scrolled away or left the chat, with an optional wake lock while downloading | the author does not use it and some of its parts caused problems with downloads. the wake lock option only worked under it and went with it |
| custom edited and deleted marks | your own text for the "edited" and "deleted" labels on messages | too narrow for the core app. it lives in the [custom marks](https://github.com/entinyGram/plugins/tree/main/plugins/features/custom-marks) plugin instead |
| drawer material 3 sections | grouped side drawer rows into rounded cards | inugram shipped its own material 3 drawer redesign, kept as the base after the merge so the two styles do not stack |
| raise fab buttons | a toggle that lifted the chat-list buttons a few dp | it had no effect: the code that read it was never called |
| thicken bold text | a fonts toggle that faked a bold weight for custom fonts without one | it only touched non-variable fonts lacking a bold face and needed a restart, so it did almost nothing. the fake bold stays always on. `tg://entinySettings/thicken-bold-text` now opens the fonts page |
| ui translations | ru, uk, ja, zh-rCN, tr, ar, fa, es and it strings for entinygram's own settings and menus | this build is english only. the app's locale filter is derived from the `strings_inu.xml` folders, so the apk now carries default english resources only. chat translation providers are unchanged |
| proxy extras | proxy list tools and menu, import from clipboard, connect-choice, proxy link sheet, aggressive rotation, websocket tunnel, leak guard, auto-disable on vpn, proxy country flag in the dc ping pill, the proxy pill and the experimental proxy page | telegram's own proxy settings are enough. the code is deleted along with the `proxy-settings`, `proxy-rotation-fix`, `anticensorship` and `proxy-batch-import` patches |
| maps and location | osmdroid map view, map provider and map preview provider settings, hybrid-view guard, weather pill and its location picker | the build uses telegram's stock google maps provider again and the fork adds nothing on top. the code is deleted along with the `osmdroid-provider-wiring` and `maps` patches |

## how to add a row

- name the feature the way the settings page did.
- say what it did in one short phrase.
- give the reason in a form that is fine to show publicly.
