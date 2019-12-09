package moka.land.imagehelper.picker.builder

import moka.land.imagehelper.picker.type.SelectType
import java.io.Serializable

class ImagePickerConfig : Serializable {

    internal var selectType: SelectType = SelectType.SINGLE

    var camera: Boolean = true

}