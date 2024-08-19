package app.k9mail.core.ui.compose.designsystem.atom.icon.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _Person: ImageVector? = null

val Person: ImageVector
    get() {
        if (_Person != null) {
            return _Person!!
        }
        _Person = ImageVector.Builder(
            name = "Person",
            defaultWidth = 25.dp,
            defaultHeight = 25.dp,
            viewportWidth = 25f,
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
                moveTo(18.2527f, 14.9057f)
                curveTo(19.4947f, 14.9057f, 20.5016f, 15.9126f, 20.5016f, 17.1546f)
                verticalLineTo(17.73f)
                curveTo(20.5016f, 18.6243f, 20.182f, 19.4891f, 19.6005f, 20.1685f)
                curveTo(18.0311f, 22.002f, 15.6439f, 22.9068f, 12.4985f, 22.9068f)
                curveTo(9.3527f, 22.9068f, 6.9667f, 22.0017f, 5.4004f, 20.1674f)
                curveTo(4.8206f, 19.4885f, 4.5021f, 18.625f, 4.5021f, 17.7323f)
                verticalLineTo(17.1546f)
                curveTo(4.5021f, 15.9126f, 5.5089f, 14.9057f, 6.7509f, 14.9057f)
                horizontalLineTo(18.2527f)
                close()
                moveTo(18.2527f, 16.4057f)
                horizontalLineTo(6.75095f)
                curveTo(6.3374f, 16.4057f, 6.0021f, 16.741f, 6.0021f, 17.1546f)
                verticalLineTo(17.7323f)
                curveTo(6.0021f, 18.2679f, 6.1932f, 18.786f, 6.541f, 19.1934f)
                curveTo(7.7943f, 20.6611f, 9.7602f, 21.4068f, 12.4985f, 21.4068f)
                curveTo(15.2368f, 21.4068f, 17.2044f, 20.661f, 18.4609f, 19.1931f)
                curveTo(18.8098f, 18.7855f, 19.0016f, 18.2666f, 19.0016f, 17.73f)
                verticalLineTo(17.1546f)
                curveTo(19.0016f, 16.741f, 18.6663f, 16.4057f, 18.2527f, 16.4057f)
                close()
                moveTo(12.4985f, 2.9104f)
                curveTo(15.26f, 2.9104f, 17.4985f, 5.149f, 17.4985f, 7.9104f)
                curveTo(17.4985f, 10.6718f, 15.26f, 12.9104f, 12.4985f, 12.9104f)
                curveTo(9.7371f, 12.9104f, 7.4985f, 10.6718f, 7.4985f, 7.9104f)
                curveTo(7.4985f, 5.149f, 9.7371f, 2.9104f, 12.4985f, 2.9104f)
                close()
                moveTo(12.4985f, 4.4104f)
                curveTo(10.5655f, 4.4104f, 8.9985f, 5.9774f, 8.9985f, 7.9104f)
                curveTo(8.9985f, 9.8434f, 10.5655f, 11.4104f, 12.4985f, 11.4104f)
                curveTo(14.4315f, 11.4104f, 15.9985f, 9.8434f, 15.9985f, 7.9104f)
                curveTo(15.9985f, 5.9774f, 14.4315f, 4.4104f, 12.4985f, 4.4104f)
                close()
            }
        }.build()
        return _Person!!
    }
