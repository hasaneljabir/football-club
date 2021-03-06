/*
 * Submission 1 - Kotlin Android Developer Expert
 * Developer : Hasan El Jabir
 */

package id.hasaneljabir.footballclub.UI

import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import org.jetbrains.anko.*

class FootballClubItemUI : AnkoComponent<ViewGroup> {
    companion object {
        val imgFootballClubLogo = 1
        val txtFootballClubName = 2
    }

    override fun createView(ui: AnkoContext<ViewGroup>) = with(ui) {
        linearLayout {
            orientation = LinearLayout.HORIZONTAL
            lparams(matchParent, wrapContent)
            padding = dip(16)

            imageView {
                id = imgFootballClubLogo
            }.lparams(dip(50), dip(50))

            textView {
                id = txtFootballClubName
            }.lparams(matchParent, wrapContent) {
                margin = dip(10)
                gravity = Gravity.CENTER_VERTICAL
            }
        }
    }
}