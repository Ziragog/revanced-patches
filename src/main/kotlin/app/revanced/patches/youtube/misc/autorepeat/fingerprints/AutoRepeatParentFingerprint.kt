package app.revanced.patches.youtube.misc.autorepeat.fingerprints

import app.revanced.patcher.annotation.Name
import app.revanced.patcher.annotation.Version
import app.revanced.patcher.extensions.or
import app.revanced.patcher.fingerprint.method.annotation.FuzzyPatternScanMethod
import app.revanced.patcher.fingerprint.method.annotation.MatchingMethod
import app.revanced.patcher.fingerprint.method.impl.MethodFingerprint
import app.revanced.patches.youtube.misc.autorepeat.annotations.AutoRepeatCompatibility
import org.jf.dexlib2.AccessFlags

@Name("auto-repeat-parent-fingerprint")
@MatchingMethod(
    "Laamp;", "E"
)
@FuzzyPatternScanMethod(2)
@AutoRepeatCompatibility
@Version("0.0.1")
object AutoRepeatParentFingerprint : MethodFingerprint(
    "V",
    AccessFlags.PUBLIC or AccessFlags.FINAL,
    strings = listOf(
        "play() called when the player wasn't loaded.",
        "play() blocked because Background Playability failed"
    )
)