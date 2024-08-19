package app.k9mail.core.ui.compose.designsystem.atom.icon

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import app.k9mail.core.ui.legacy.designsystem.atom.icon.Icons as LegacyIcons
import app.k9mail.core.ui.compose.designsystem.atom.icon.icons.Info as VectorIconsInfo
import app.k9mail.core.ui.compose.designsystem.atom.icon.icons.Check as VectorIconsCheck

// We're using getters so not all icons are loaded into memory as soon as one of the nested objects is accessed.
object Icons {
    object Default {
        val Info = VectorIconsInfo
        val Check = VectorIconsCheck
    }

    object Filled {
        val CheckCircle: ImageVector
            @Composable
            get() = ImageVector.vectorResource(id = LegacyIcons.Filled.Check)

        val Cancel: ImageVector
            @Composable
            get() = ImageVector.vectorResource(id = LegacyIcons.Filled.Close)
    }

    object Outlined {
        val AccountCircle: ImageVector
            @Composable
            get() = ImageVector.vectorResource(id = LegacyIcons.Outlined.AccountCircle)

        val ArrowBack: ImageVector
            @Composable
            get() = ImageVector.vectorResource(id = LegacyIcons.Outlined.ArrowBack)

        val Check: ImageVector
            @Composable
            get() = ImageVector.vectorResource(id = LegacyIcons.Outlined.Check)

        val ErrorOutline: ImageVector
            @Composable
            get() = ImageVector.vectorResource(id = LegacyIcons.Outlined.Error)

        val ExpandMore: ImageVector
            @Composable
            get() = ImageVector.vectorResource(id = LegacyIcons.Outlined.ExpandMore)

        val ExpandLess: ImageVector
            @Composable
            get() = ImageVector.vectorResource(id = LegacyIcons.Outlined.ExpandLess)

        val Inbox: ImageVector
            @Composable
            get() = ImageVector.vectorResource(id = LegacyIcons.Outlined.Inbox)

        val Info: ImageVector
            @Composable
            get() = ImageVector.vectorResource(id = LegacyIcons.Outlined.Info)

        val Menu: ImageVector
            @Composable
            get() = ImageVector.vectorResource(id = LegacyIcons.Outlined.Menu)

        val Outbox: ImageVector
            @Composable
            get() = ImageVector.vectorResource(id = LegacyIcons.Outlined.Outbox)

        val Security: ImageVector
            @Composable
            get() = ImageVector.vectorResource(id = LegacyIcons.Outlined.Security)

        val Visibility: ImageVector
            @Composable
            get() = ImageVector.vectorResource(id = LegacyIcons.Outlined.Visibility)

        val VisibilityOff: ImageVector
            @Composable
            get() = ImageVector.vectorResource(id = LegacyIcons.Outlined.VisibilityOff)
    }
}

@Composable
@Preview(showBackground = true)
private fun ImagePreview() {
    Icon(imageVector = IconsWithBottomRightOverlay.person.image)
}
