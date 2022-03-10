package ru.sscalliance.ui.sport.eventDetails.presentation.presenter

import ru.sscalliance.domain.sport.mainScreen.interactor.ISportInteractor
import ru.sscalliance.ui.base.presenter.BasePresenter
import ru.sscalliance.ui.base.presenter.IMvpPresenter
import ru.sscalliance.ui.sport.eventDetails.presentation.view.IEventDetailsActivity
import javax.inject.Inject

interface IEventDetailsPresenter<V : IEventDetailsActivity, I : ISportInteractor> :
    IMvpPresenter<V, I>

class EventDetailsPresenter<V : IEventDetailsActivity, I : ISportInteractor> @Inject constructor(
    interactor: I
) : BasePresenter<V, I>(
    interactor
), IEventDetailsPresenter<V, I> {

}