package fr.vsct.tock.bot.open.data.story

import fr.vsct.tock.bot.open.data.logger
import fr.vsct.tock.bot.definition.story
import fr.vsct.tock.nlp.entity.StringValue
import fr.vsct.tock.bot.engine.BotBus

val codeSecretFirstIntent = story(
        "codeSecretFirst") {

    logger.debug("prenom")
    resetDialogState()
 
	var codeSecretFirstInt : Int?= codeSecretFirst?.value?.toInt()
	if(codeSecretFirstInt == null ){
		end("désolé merci de me donner votre code secret pour une connexion sécurisé")
	}else{
		
		when(codeSecretFirstInt){
			1234 -> send("vous avez dit " + codeSecretFirst + " la connexion viens d'etre établi avec l'application merci! " )
			else -> send("vous avez dit " + codeSecretFirst + "ceci n'est malheureusement pas le bon code, il vous reste deux tentatives" )
		}
		
		end()
	}
}
