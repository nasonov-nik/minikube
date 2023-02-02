В данном случае развернул ингресс на входе в проектe.

Установка nginx
1. загрузить ConfigMap - nginx/cm-nginx-proxy.yaml.
cm нужна для добавления настроек nginx

2. Загрузить Deployment - deploymen-nginx-proxy.yaml

3. Создать svc - nginx/svc-nginx-proxy.yaml

Установка ingress
1. Развернуть истое в проекте test-namespace - ingress/deployment-ingress-test-namespace.yaml
#TODO проверить конфиг мапы и секреты для истио в проекте test-namespace

2. Создать ingress/svc-ingress-test-namespace.yaml
абстрация в OSE которая нужна для объединения всех подом пот одним статичным IP.
Статичный IP создается как раз при помощи svc. Так же обратите внимание на тип кластера clusterIP.
clusterIP - доступен только внутри кластера. Порт у пода 8001 (открывается при помощи Gateway)

3. Создать Gateway - ingress/gateway-ingress-test-namespace.yaml
Нужен для создания listnera на определенном порту. В нашем случае порт 8001

4. Создать VS - ingress/vs-ingress-test-namespace.yaml
Правила маршрутизации трафика.
Ingress будет перенправлять весь трафмк с порта 8001 на svc ingress-test-namespace (port 8080) и далее на порт пода 80.

5. #TODO создать DR