package app.k9mail.core.ui.compose.designsystem.atom.icon.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _Warning: ImageVector? = null

val Warning: ImageVector
    get() {
        if (_Warning != null) {
            return _Warning!!
        }
        _Warning = ImageVector.Builder(
            name = "Warning",
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
                moveTo(13.0051f, 17.9057f)
                curveTo(13.0051f, 17.3542f, 12.558f, 16.9071f, 12.0065f, 16.9071f)
                curveTo(11.4549f, 16.9071f, 11.0078f, 17.3542f, 11.0078f, 17.9057f)
                curveTo(11.0078f, 18.4573f, 11.4549f, 18.9044f, 12.0065f, 18.9044f)
                curveTo(12.558f, 18.9044f, 13.0051f, 18.4573f, 13.0051f, 17.9057f)
                close()
                moveTo(12.7459f, 10.0525f)
                curveTo(12.696f, 9.6864f, 12.382f, 9.4045f, 12.0023f, 9.4048f)
                curveTo(11.5881f, 9.4052f, 11.2525f, 9.7412f, 11.2529f, 10.1554f)
                lineTo(11.2565f, 14.657f)
                lineTo(11.2634f, 14.7588f)
                curveTo(11.3134f, 15.1248f, 11.6274f, 15.4067f, 12.0071f, 15.4064f)
                curveTo(12.4213f, 15.4061f, 12.7568f, 15.07f, 12.7565f, 14.6558f)
                lineTo(12.7529f, 10.1542f)
                lineTo(12.7459f, 10.0525f)
                close()
                moveTo(13.9751f, 4.56464f)
                curveTo(13.1189f, 3.0168f, 10.8937f, 3.0169f, 10.0375f, 4.5647f)
                lineTo(2.2922f, 18.5662f)
                curveTo(1.4626f, 20.0658f, 2.5473f, 21.9053f, 4.261f, 21.9053f)
                horizontalLineTo(19.7521f)
                curveTo(21.4659f, 21.9053f, 22.5505f, 20.0657f, 21.7209f, 18.5661f)
                lineTo(13.9751f, 4.56464f)
                close()
                moveTo(11.35f, 5.29077f)
                curveTo(11.6354f, 4.7748f, 12.3772f, 4.7748f, 12.6626f, 5.2908f)
                lineTo(20.4083f, 19.2922f)
                curveTo(20.6849f, 19.7921f, 20.3233f, 20.4053f, 19.7521f, 20.4053f)
                horizontalLineTo(4.26104f)
                curveTo(3.6898f, 20.4053f, 3.3282f, 19.7921f, 3.6048f, 19.2922f)
                lineTo(11.35f, 5.29077f)
                close()
            }
        }.build()
        return _Warning!!
    }
