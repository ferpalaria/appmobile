<?php

$usuario = $_GET['usuario'];
$senha = $_GET['senha'];

$resposta = new stdClass();

if ($usuario == 'usuario' && $senha == 'senha'){
    $resposta->Status = "\"OK\"";
} else {
    $resposta->Status = "\"FALHA\"";
}

echo $resposta->Status;
