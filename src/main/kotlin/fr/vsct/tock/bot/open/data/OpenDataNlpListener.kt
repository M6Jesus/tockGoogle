package fr.vsct.tock.bot.open.data

import fr.vsct.tock.bot.engine.nlp.NlpListener

/**
 * Evaluate place entity values.
 */
object OpenDataNlpListener : NlpListener {

//    init {
//        //we add a new value type in order to manage open data api place
//        //{"@type" : "place"} will look better in mongo than {"@type" : "fr.vsct.tock.bot.open.data.client.sncf.model.Place"}
//        ValueResolverRepository.registerType(PlaceValue::class)
//    }
//
//    override fun evaluateEntities(
//        userTimeline: UserTimeline,
//        dialog: Dialog,
//        event: Event,
//        nlpResult: NlpResult
//    ): List<EntityValue> {
//        //evaluate localities
//        return nlpResult
//            .entities
//            .filter { it.entity.entityType == locationEntity.entityType }
//            .mapNotNull { entityValue ->
//                findPlace(nlpResult.entityTextContent(entityValue))?.let { EntityValue(entityValue.entity, it) }
//            }
//    }
}
