package com.github.rusakovichma.tictaac.engine;

import com.github.rusakovichma.tictaac.model.Threat;
import com.github.rusakovichma.tictaac.model.ThreatModel;
import com.github.rusakovichma.tictaac.model.ThreatRule;

import java.util.Collection;

interface EngineContext {

    Collection<Threat> eval(ThreatModel threatModel, Collection<ThreatRule> rules);

}
