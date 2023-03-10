package cn.meshed.cloud.rd.cli.executor.query;

import cn.meshed.cloud.cqrs.QueryExecute;
import cn.meshed.cloud.rd.cli.config.EngineTemplateProperties;
import cn.meshed.cloud.rd.domain.cli.Archetype;
import cn.meshed.cloud.utils.AssertUtils;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

/**
 * <h1>根据引擎模板查询原型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequiredArgsConstructor
@Component
public class ArchetypeTemplateQry implements QueryExecute<String, Archetype> {

    private final EngineTemplateProperties engineTemplateProperties;

    /**
     * <h1>根据引擎模板查询原型</h1>
     *
     * @param engineTemplate 引擎模板
     * @return {@link Archetype}
     */
    @Override
    public Archetype execute(String engineTemplate) {
        AssertUtils.isTrue(StringUtils.isNotBlank(engineTemplate), "模板引擎名称不能为空");
        List<Archetype> engineTemplates = engineTemplateProperties.getEngineTemplates();
        if (CollectionUtils.isNotEmpty(engineTemplates)) {
            return engineTemplates.stream().filter(Objects::nonNull)
                    .filter(archetype -> engineTemplate.equalsIgnoreCase(archetype.getArchetypeArtifactId()))
                    .findFirst().orElse(null);
        }
        return null;
    }
}
