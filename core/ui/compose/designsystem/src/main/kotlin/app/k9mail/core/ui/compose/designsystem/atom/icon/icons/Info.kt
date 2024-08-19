package app.k9mail.core.ui.compose.designsystem.atom.icon.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _Info: ImageVector? = null

val Info: ImageVector
    get() {
        if (_Info != null) {
            return _Info!!
        }
        _Info = ImageVector.Builder(
            name = "Info",
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
                moveTo(12f, 2.90479f)
                curveTo(17.5237f, 2.9048f, 22.0016f, 7.3826f, 22.0016f, 12.9063f)
                curveTo(22.0016f, 18.43f, 17.5237f, 22.9079f, 12f, 22.9079f)
                curveTo(6.4763f, 22.9079f, 1.9985f, 18.43f, 1.9985f, 12.9063f)
                curveTo(1.9985f, 7.3826f, 6.4763f, 2.9048f, 12f, 2.9048f)
                close()
                moveTo(12f, 4.40479f)
                curveTo(7.3048f, 4.4048f, 3.4985f, 8.2111f, 3.4985f, 12.9063f)
                curveTo(3.4985f, 17.6016f, 7.3048f, 21.4079f, 12f, 21.4079f)
                curveTo(16.6953f, 21.4079f, 20.5016f, 17.6016f, 20.5016f, 12.9063f)
                curveTo(20.5016f, 8.2111f, 16.6953f, 4.4048f, 12f, 4.4048f)
                close()
                moveTo(11.9964f, 11.4054f)
                curveTo(12.3761f, 11.4051f, 12.6901f, 11.6871f, 12.74f, 12.0531f)
                lineTo(12.7469f, 12.1549f)
                lineTo(12.7505f, 17.6565f)
                curveTo(12.7507f, 18.0707f, 12.4152f, 18.4067f, 12.001f, 18.407f)
                curveTo(11.6213f, 18.4072f, 11.3073f, 18.1253f, 11.2574f, 17.7592f)
                lineTo(11.2505f, 17.6575f)
                lineTo(11.2469f, 12.1559f)
                curveTo(11.2466f, 11.7416f, 11.5822f, 11.4056f, 11.9964f, 11.4054f)
                close()
                moveTo(12.0005f, 7.9076f)
                curveTo(12.552f, 7.9076f, 12.9991f, 8.3547f, 12.9991f, 8.9063f)
                curveTo(12.9991f, 9.4578f, 12.552f, 9.9049f, 12.0005f, 9.9049f)
                curveTo(11.4489f, 9.9049f, 11.0018f, 9.4578f, 11.0018f, 8.9063f)
                curveTo(11.0018f, 8.3547f, 11.4489f, 7.9076f, 12.0005f, 7.9076f)
                close()
            }
        }.build()
        return _Info!!
    }
