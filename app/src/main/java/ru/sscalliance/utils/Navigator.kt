package ru.sscalliance.utils

import android.content.Context
import android.content.Intent
import ru.sscalliance.domain.sport.main.model.EventBusinessModel
import ru.sscalliance.ui.main.view.MainActivity
import ru.sscalliance.ui.section.main.presentation.view.MainSectionActivity
import ru.sscalliance.ui.sport.eventDetails.presentation.view.EventDetailsActivity
import javax.inject.Inject

interface INavigator {
    fun openMainScreen()
    fun openMainSectionScreen()
    fun openEventDetailsScreen(item: EventBusinessModel)
}

class Navigator @Inject constructor(
    private val context: Context
) : INavigator {

    companion object {
        const val EVENT_DETAILS = "event_details"
    }

    override fun openMainScreen() = context.startActivity(
        Intent(context, MainActivity::class.java)
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
    )

    override fun openMainSectionScreen() = context.startActivity(
        Intent(context, MainSectionActivity::class.java)
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    )

    override fun openEventDetailsScreen(item: EventBusinessModel) {
        val intent = Intent(context, EventDetailsActivity::class.java)
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            .putExtra(EVENT_DETAILS, item)
        context.startActivity(intent)
    }

}