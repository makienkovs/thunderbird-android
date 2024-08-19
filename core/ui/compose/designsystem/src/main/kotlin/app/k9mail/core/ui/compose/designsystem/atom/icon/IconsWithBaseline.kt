package app.k9mail.core.ui.compose.designsystem.atom.icon

import androidx.compose.ui.unit.dp
import app.k9mail.core.ui.compose.common.image.ImageWithBaseline
import app.k9mail.core.ui.compose.designsystem.atom.icon.icons.Warning

// We're using "by lazy" so not all icons are loaded into memory as soon as a nested object is accessed. But once a
// property is accessed we want to retain the `ImageWithBaseline` instance.
object IconsWithBaseline {
    object Filled {
        val warning: ImageWithBaseline by lazy {
            ImageWithBaseline(image = Warning, baseline = 21.dp)
        }
    }
}
