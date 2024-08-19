package app.k9mail.core.ui.compose.designsystem.atom.icon.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _Notification: ImageVector? = null

val Notification: ImageVector
    get() {
        if (_Notification != null) {
            return _Notification!!
        }
        _Notification = ImageVector.Builder(
            name = "Notification",
            defaultWidth = 24.dp,
            defaultHeight = 25.dp,
            viewportWidth = 24f,
            viewportHeight = 25f
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
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12f, 2.90198f)
                curveTo(16.0499f, 2.902f, 19.3567f, 6.0967f, 19.4958f, 10.151f)
                lineTo(19.5f, 10.402f)
                verticalLineTo(14.4989f)
                lineTo(20.88f, 17.655f)
                curveTo(20.9491f, 17.8129f, 20.9847f, 17.9834f, 20.9847f, 18.1558f)
                curveTo(20.9847f, 18.8461f, 20.4251f, 19.4058f, 19.7347f, 19.4058f)
                lineTo(15f, 19.4072f)
                curveTo(15f, 21.0641f, 13.6569f, 22.4072f, 12f, 22.4072f)
                curveTo(10.4023f, 22.4072f, 9.0963f, 21.1583f, 9.0051f, 19.5835f)
                lineTo(8.99954f, 19.405f)
                lineTo(4.27486f, 19.4058f)
                curveTo(4.1035f, 19.4058f, 3.934f, 19.3705f, 3.7769f, 19.3023f)
                curveTo(3.1437f, 19.0272f, 2.8533f, 18.291f, 3.1284f, 17.6578f)
                lineTo(4.5f, 14.4999f)
                verticalLineTo(10.4019f)
                curveTo(4.5006f, 6.2471f, 7.8521f, 2.902f, 12f, 2.902f)
                close()
                moveTo(13.4995f, 19.405f)
                lineTo(10.5f, 19.4072f)
                curveTo(10.5f, 20.2357f, 11.1716f, 20.9072f, 12f, 20.9072f)
                curveTo(12.7797f, 20.9072f, 13.4204f, 20.3124f, 13.4931f, 19.5517f)
                lineTo(13.4995f, 19.405f)
                close()
                moveTo(12f, 4.40198f)
                curveTo(8.6798f, 4.402f, 6.0005f, 7.0762f, 6f, 10.402f)
                verticalLineTo(14.8116f)
                lineTo(4.65602f, 17.9058f)
                horizontalLineTo(19.3525f)
                lineTo(18f, 14.8126f)
                lineTo(18.0001f, 10.4148f)
                lineTo(17.9964f, 10.1896f)
                curveTo(17.8853f, 6.9562f, 15.2416f, 4.402f, 12f, 4.402f)
                close()
            }
        }.build()
        return _Notification!!
    }
