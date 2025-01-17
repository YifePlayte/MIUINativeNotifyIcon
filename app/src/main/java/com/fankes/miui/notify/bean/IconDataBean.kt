/**
 * Copyright (C) 2022. Fankes Studio(qzmmcn@163.com)
 *
 * This file is part of MIUINativeNotifyIcon.
 *
 * MIUINativeNotifyIcon is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MIUINativeNotifyIcon is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * This file is Created by fankes on 2022/1/30.
 */
package com.fankes.miui.notify.bean

import android.graphics.Bitmap
import com.fankes.miui.notify.utils.base64
import java.io.Serializable

/**
 * 通知栏小图标 bean
 * @param appName APP 名称 - 仅限默认语言区域
 * @param packageName 包名
 * @param iconBitmap 图标位图
 * @param contributorName 贡献者昵称
 * @param isEnabled 是否默认启用替换彩色图标 - 关闭后将全部停止替换
 * @param isEnabledAll 是否默认启用替换全部图标
 */
data class IconDataBean(
    var appName: String,
    var packageName: String,
    var iconBitmap: Bitmap,
    var contributorName: String,
    var isEnabled: Boolean,
    var isEnabledAll: Boolean,
) : Serializable {
    fun toEnabledName() = ("$appName$packageName").base64 + "_enable"
    fun toEnabledAllName() = ("$appName$packageName").base64 + "_enable_all"
}