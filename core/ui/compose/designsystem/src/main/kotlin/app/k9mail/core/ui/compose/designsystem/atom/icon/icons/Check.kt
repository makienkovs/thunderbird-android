package app.k9mail.core.ui.compose.designsystem.atom.icon.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _Check: ImageVector? = null

val Check: ImageVector
    get() {
        if (_Check != null) {
            return _Check!!
        }
        _Check = ImageVector.Builder(
            name = "Checkmark",
            defaultWidth = 24.dp,
            defaultHeight = 25.dp,
            viewportWidth = 24f,
            viewportHeight = 25f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF424242)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero,
            ) {
                moveTo(4.53033f, 13.8754f)
                curveTo(4.2374f, 13.5825f, 3.7626f, 13.5825f, 3.4697f, 13.8754f)
                curveTo(3.1768f, 14.1683f, 3.1768f, 14.6432f, 3.4697f, 14.9361f)
                lineTo(7.96967f, 19.4361f)
                curveTo(8.2626f, 19.729f, 8.7374f, 19.729f, 9.0303f, 19.4361f)
                lineTo(20.0303f, 8.43609f)
                curveTo(20.3232f, 8.1432f, 20.3232f, 7.6683f, 20.0303f, 7.3754f)
                curveTo(19.7374f, 7.0825f, 19.2626f, 7.0825f, 18.9697f, 7.3754f)
                lineTo(8.5f, 17.8451f)
                lineTo(4.53033f, 13.8754f)
                close()
            }
        }.build()
        return _Check!!
    }
